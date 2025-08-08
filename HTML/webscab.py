import requests
from bs4 import BeautifulSoup

# URL of the page you want to scrape
url = 'https://timesofindia.indiatimes.com/world/us/21-million-going-to-my-friend-pm-modi-us-president-donald-trump-fixates-on-fund-to-india-for-third-day-in-a-row/articleshow/118469643.cms'

# Send a GET request to the URL
response = requests.get(url)

# Check if the request was successful
if response.status_code == 200:
    # Parse the HTML content of the page
    soup = BeautifulSoup(response.text, 'html.parser')
    
    # Extract the title of the page
    title = soup.find('title').text
    print("Page Title:", title)
    
    # Extract all paragraph texts from the page
    paragraphs = soup.find_all('p')
    for p in paragraphs:
        print(p.text)
else:
    print("Failed to retrieve the webpage. Status code:", response.status_code)
