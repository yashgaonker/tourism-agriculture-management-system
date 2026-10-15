# Tourism and Agriculture Management System (Java OOP A2)

A menu-driven Java program demonstrating five inheritance patterns with tourism and agriculture examples.

## Inheritance covered
1. **Single:** `TourismService -> TourGuide`
2. **Multilevel:** `TourismService -> TravelAgency -> AdventureTour`
3. **Hierarchical:** `TourismService -> TourGuide` and `TourismService -> HotelService`
4. **Multiple-style:** `OrganicFarmer implements CropManagement, SustainableFarming`
5. **Hybrid:** `Farm implements CropManagement`; `SmartFarm extends Farm implements SustainableFarming`

Java does not allow a class to extend two classes. The multiple-inheritance example therefore uses two interfaces.

## Requirements
JDK 17 or later recommended.

## Compile and run
Open a terminal in this project folder:

```bash
javac -d . src/TourismAgricultureManagementSystem.java
java TourismAgricultureManagementSystem
```

## Generate JavaDoc
```bash
javadoc -d docs src/TourismAgricultureManagementSystem.java
```
Then open `docs/index.html` in a browser.

## GitHub upload
Create an empty repository on GitHub, then run the following from this project folder (replace the URL with your repository URL):

```bash
git init
git add .
git commit -m "Add tourism and agriculture inheritance assignment"
git branch -M main
git remote add origin https://github.com/YOUR-USERNAME/tourism-agriculture-management-system.git
git push -u origin main
```
If `origin` already exists, use `git remote set-url origin YOUR-REPOSITORY-URL` instead of `git remote add origin ...`.
