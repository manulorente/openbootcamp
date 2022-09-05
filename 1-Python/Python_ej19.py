# Ask user for a list of countries and create a list separated by commas.
countries = input("Enter a list of countries separated by commas: ")
# Remove repeated elements.
countries = sorted(list(set(countries.split(','))))
# Print the list of countries in alphabetical order.
print(",".join(countries))