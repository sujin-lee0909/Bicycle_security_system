# Bicycle_security_system 🚴‍♂️🚴🚴‍♀️
<img width="540" alt="스크린샷 2020-03-20 오후 8 47 54" src="https://user-images.githubusercontent.com/59409892/77161088-2d1e2d80-6aec-11ea-8ee3-a3d07c4f8f1e.png">
It is bicycle security system with BBC microbit. It can relieve the hassle for taking bicycle lock and bowing down to enter a passwords.

Here are two main points in our system. Firstly, it is simple to make your own password. Microbit has three buttons basically, and it can be three kinds of number (A, B, and A+B). With these buttons you can make 6 digit password. Second we used 'survo motor', 'spur gear' and 'rack gear'. Maybe if you want to make it yourself, you have to buy not only microbit kits but also rack gear. Lastly, we designed all of it by ourselves and printed with 3D printer. If you need 3D printer design file, you can contact me separately.

You can see acting it in mp4 file. 

## Hardware configuration ⚙️🔒🔓
<img width="419" alt="스크린샷 2020-03-20 오후 8 53 53" src="https://user-images.githubusercontent.com/59409892/77161402-ea108a00-6aec-11ea-9b19-76e93829acfd.png">
We used secondary battery to used motor. Spur gear radian is about 22mm, rack gear's rack is about 125mm. 
<img width="513" alt="스크린샷 2020-03-20 오후 8 56 25" src="https://user-images.githubusercontent.com/59409892/77161533-44a9e600-6aed-11ea-8539-741d6f65a2be.png">
<img width="458" alt="스크린샷 2020-03-20 오후 8 56 41" src="https://user-images.githubusercontent.com/59409892/77161557-54c1c580-6aed-11ea-8681-47ef8ec36171.png">

## Software Algorithm 👩‍💻
There are 3 functions in our bicycle security system and each function is activated with button, A, B and A+B.

First is 'lock function' with button A. When you push A button in first time, you have to set password. After setting your password you can lock very easily. To visualization locking and unlocking, we put icon like 🔒 and 🔓. So user can see status of bicycle lock. When system in locking status and detect acceleration like lifting up bicycle, it make some beep sound to announce the theft. This function is activated by accelation sensor value.

Second is 'unlock function' with button B. When you put correct password, it unlock and show smile face🙂. However when you put incorrect password, it show sad face☹️.

Last is 'riding function' with button A+B. It just sign with scrolling bicycle icon. May be it can give some sign to pedestrian.
