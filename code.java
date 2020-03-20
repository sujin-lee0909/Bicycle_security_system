let button = 0
let w_len = 0
let check = 0
let index = 0
let index3 = 0
let state = 0
let pwd: number[] = []
let _try: number[] = []
let lock = 0
let gradient = 0
let warn = 0
// LOCK
function A22222() {
    lock222222()
    lock = 1
    gradient = input.acceleration(Dimension.Strength)
}
function lock222222() {
    basic.showLeds(`
        . . . # #
        . . . # .
        # # # # #
        # . . . #
        . # # # .
        `)
    basic.pause(1000)
    basic.showLeds(`
        . # # # .
        . # . # .
        # # # # #
        # . . . #
        . # # # .
        `)
    basic.pause(2000)
    pins.servoWritePin(AnalogPin.P1, 0)
    state = 1
}
function setting22222() {
    for (let index2 = 0; index2 <= 5; index2++) {
        basic.showNumber(index2 + 1)
        while (pwd[index2] == -1) {
            if (input.buttonIsPressed(Button.A) == true) {
                pwd[index2] = 0
                break
            }
            if (input.buttonIsPressed(Button.B) == true) {
                pwd[index2] = 1
                break
            }
            if (input.buttonIsPressed(Button.AB) == true) {
                pwd[index2] = 2
                break
            }
        }
        basic.pause(100)
    }
}
// UNLOCK
function B22222() {
    // 처음에만 비밀번호 설정하도록
    if (pwd[0] == -1) {
        basic.showLeds(`
            . . . # #
            . . . # .
            # # # # #
            # . . . #
            . # # # .
            `)
        basic.pause(500)
        basic.showLeds(`
            . . . . .
            . . . . .
            . . . . .
            . . . . .
            . . . . .
            `)
        basic.showLeds(`
            . . . # #
            . . . # .
            # # # # #
            # . . . #
            . # # # .
            `)
        basic.pause(1000)
        // 화면 지우기
        basic.showLeds(`
            # . # # #
            . . . . .
            # . # # #
            . . . . .
            # . # # #
            `)
    } else {
        for (let t_time = 0; t_time <= 2; t_time++) {
            basic.showLeds(`
                . # # # .
                . # . # .
                # # # # #
                # . . . #
                . # # # .
                `)
            basic.pause(1000)
            while (button < 6) {
                basic.showNumber(button + 1)
                while (_try[button] == -1) {
                    if (input.buttonIsPressed(Button.A) == true) {
                        _try[button] = 0
                        break
                    }
                    if (input.buttonIsPressed(Button.B) == true) {
                        _try[button] = 1
                        break
                    }
                    if (input.buttonIsPressed(Button.AB) == true) {
                        _try[button] = 2
                        break
                    }
                }
                button += 1
                basic.pause(100)
            }
            check = 1
            for (let index4 = 0; index4 <= 5; index4++) {
                // 지우기 basic.showNumber(_try[index4]) basic.pause(100)
                // basic.showLeds(` . . . . . . . . . . . . . . . . .
                // . . . . . . . . `)
                if (_try[index4] != pwd[index4]) {
                    check = 0
                }
            }
            if (check == 1) {
                lock = 0
            } else {
                basic.showIcon(IconNames.No)
                basic.pause(1000)
                basic.showIcon(IconNames.Sad)
                basic.pause(1000)
                // 사용자 입력에 대한reset
                _try = [-1, -1, -1, -1, -1, -1]
                button = 0
            }
            if (lock == 0) {
                break
            }
        }
        if (lock == 0) {
            basic.showIcon(IconNames.Happy)
            basic.pause(1000)
            basic.showIcon(IconNames.Yes)
            basic.pause(1000)
            unlock22222()
            // 사용자 입력에 대한reset
            _try = [-1, -1, -1, -1, -1, -1]
            button = 0
        } else {
            music.playTone(262, music.beat(BeatFraction.Whole))
        }
    }
}
function unlock22222() {
    basic.showLeds(`
        . # # # .
        . # . # .
        # # # # #
        # . . . #
        . # # # .
        `)
    basic.pause(1000)
    basic.showLeds(`
        . . . # #
        . . . # .
        # # # # #
        # . . . #
        . # # # .
        `)
    state = 0
    pins.servoWritePin(AnalogPin.P1, 180)
    basic.pause(2000)
}
function warning222() {
    warn = 0
    music.playTone(262, music.beat(BeatFraction.Eighth))
    while (true) {
        basic.showLeds(`
            # . . . #
            . # . # .
            . . # . .
            . # . # .
            # . . . #
            `)
        basic.pause(2000)
        if (input.buttonIsPressed(Button.AB) == true) {
            pins.digitalWritePin(DigitalPin.P0, 0)
            break
        }
    }
}
function AB22222() {
    images.createBigImage(`
        . # # # . . . . . .
        . . # . . # . . . #
        # # # # # # # . # #
        # . # . # . # . # .
        . # . . . # . . . #
        `).scrollImage(1, 200)
    basic.pause(500)
    while (true) {
        basic.showIcon(IconNames.EigthNote)
        if (input.buttonIsPressed(Button.AB) == true) {
            break
        }
    }
}
pins.servoWritePin(AnalogPin.P1, 180)
gradient = 0
_try = [-1, -1, -1, -1, -1, -1]
pwd = [-1, -1, -1, -1, -1, -1]
index3 = 0
index = 0
w_len = 0
warn = 0
// 화면 지우기
basic.showLeds(`
    # . # # #
    . . . . .
    # . # # #
    . . . . .
    # . # # #
    `)
basic.pause(1000)
while (true) {
    if (input.buttonIsPressed(Button.A) == true) {
        // 처음에만 비밀번호 설정하도록
        if (pwd[0] == -1) {
            // 화면 지우기
            basic.showLeds(`
                . # # # .
                # # . # #
                # . # . #
                # # . # #
                . # # # .
                `)
            basic.pause(1000)
            setting22222()
            // 화면 지우기
            basic.showLeds(`
                . . . . .
                . . . . .
                . . . . .
                . . . . .
                . . . . .
                `)
            basic.pause(1000)
        }
        A22222()
    }
    if (input.buttonIsPressed(Button.B) == true) {
        B22222()
    }
    if (input.buttonIsPressed(Button.AB) == true) {
        if (state == 0) {
            AB22222()
        } else {
            basic.showLeds(`
                . # # # .
                . # . # .
                # # # # #
                # . . . #
                . # # # .
                `)
            basic.pause(1000)
            // 화면 지우기
            basic.showLeds(`
                . . . . .
                . . . . .
                . . . . .
                . . . . .
                . . . . .
                `)
            basic.pause(1000)
            basic.showLeds(`
                . # # # .
                . # . # .
                # # # # #
                # . . . #
                . # # # .
                `)
        }
    }
    // if (state == 1 && (gradient - 100 <
    // input.acceleration(Dimension.Strength) || gradient
    // + 100 > input.acceleration(Dimension.Strength))) {
    if (state == 1 && (gradient - 350 > input.acceleration(Dimension.Strength) || gradient + 350 < input.acceleration(Dimension.Strength))) {
        warning222()
        pins.digitalWritePin(DigitalPin.P0, 0)
        basic.showLeds(`
            . # # # .
            . # . # .
            # # # # #
            # . . . #
            . # # # .
            `)
        gradient = input.acceleration(Dimension.Strength)
    }
}
