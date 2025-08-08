from django.contrib import admin
from .models import Product, Order

# Register models for admin panel
admin.site.register(Product)
admin.site.register(Order)
