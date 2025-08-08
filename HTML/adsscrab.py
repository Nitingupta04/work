import requests
import json

# Replace with your access token
access_token = "apify_api_DkJhK48gcjoe8ah5WnBEo2dh1avKJL3WDMfX"

# Define the API endpoint and parameters
url = "https://graph.facebook.com/v13.0/ads_archive"
params = {
    "fields": "page_id,page_name,ad_snapshot_url",
    "search_terms": "example",
    "ad_type": "POLITICAL_AND_ISSUE_ADS",
    "ad_reached_countries": ["US"],
    "access_token": access_token,
}

# Make the request
response = requests.get(url, params=params)

# Parse and print the response
if response.status_code == 200:
    print(json.dumps(response.json(), indent=4))
else:
    print("Failed to retrieve data:", response.status_code)