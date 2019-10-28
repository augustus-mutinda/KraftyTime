# KraftyTime [![](https://jitpack.io/v/augustusiam/KraftyTime.svg)](https://jitpack.io/#augustusiam/KraftyTime)
KraftTime is a small light liblary for displaying date in java or kotlin. It formarts date into whatsapp style date formating.

# How do get KraftyTime?
1. Add this to build level gradle file.
	```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
	```
2. Then add this dependency to app level gradle file.
	```
	dependencies {
	        implementation 'com.github.augustusiam:KraftyTime:Version'
	}
	```
# How do I use KraftyTime
```
        KraftyTime.with(Date yourDate)
                .setClockMode(KRAFTY.MODE_12_HOUR)
                .setDateMode(KRAFTY.DDMMYYYY)
                .setDateText(yourTextView);
```
# Clock modes
## 12 Hour mode
```
        KraftyTime.with(Date yourDate)
                .setClockMode(KRAFTY.MODE_12_HOUR)//Here
                .setDateMode(KRAFTY.DDMMYYYY)
                .setDateText(yourTextView);
```
## 24 Hour mode
```
        KraftyTime.with(Date yourDate)
                .setClockMode(KRAFTY.MODE_24_HOUR)//Here
                .setDateMode(KRAFTY.DDMMYYYY)
                .setDateText(yourTextView);
```
# Date modes
## Year, Month, Day
```
        KraftyTime.with(Date yourDate)
                .setClockMode(KRAFTY.MODE_12_HOUR)
                .setDateMode(KRAFTY.YYYYMMDD)
                .setDateText(yourTextView);
```
## Year, Day, Month
```
        KraftyTime.with(Date yourDate)
                .setClockMode(KRAFTY.MODE_12_HOUR)
                .setDateMode(KRAFTY.YYYYDDMM)
                .setDateText(yourTextView);
```
## Day, Month, Year
```
        KraftyTime.with(Date yourDate)
                .setClockMode(KRAFTY.MODE_12_HOUR)
                .setDateMode(KRAFTY.DDMMYYYY)
                .setDateText(yourTextView);
```
## More
### Short month abbreviation
To get a month abbreviated, use:
```
	KRAFTY.SHORT_WORD_DDMMYYYY
```
Then add date mode as shown above.
### Full month
To get a month, use:
```
	KRAFTY.WORD_DDMMYYYY
```
Then add date mode as shown above.

# License
This liblary is released under [Apache V2.0 License](https://github.com/augustusiam/KraftyTime/blob/master/LICENSE).
