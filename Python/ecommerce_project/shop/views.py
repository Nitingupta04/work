from django.shortcuts import render, get_object_or_404, redirect
from .models import Product, Order

# View to display all products
def product_list(request):
    products = Product.objects.all()
    return render(request, 'shop/product_list.html', {'products': products})

# View to handle product details and add to cart
def product_detail(request, product_id):
    product = get_object_or_404(Product, pk=product_id)
    
    if request.method == 'POST':
        quantity = int(request.POST['quantity'])
        Order.objects.create(
            product=product,
            quantity=quantity,
            customer_name=request.POST['customer_name'],
            customer_email=request.POST['customer_email']
        )
        return redirect('product_list')

    return render(request, 'shop/product_detail.html', {'product': product})
