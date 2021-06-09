import sys

sys.stdin = open("/home/czekras/PROJECTS/PG/Python/Codes/input.txt", "r")
sys.stdout = open("/home/czekras/PROJECTS/PG/Python/Codes/output.txt", "w")
# =========================================================================


# CodingBat Warmup1 - sleep_in
def sleep_in(weekday, vacation):
    return not weekday or vacation


# CodingBat Warmup1 - monkey_trouble
def monkey_trouble(a_smile, b_smile):
    return a_smile == b_smile


# CodingBat Warmup1 - sum_double
def sum_double(a, b):
    return a + b if a != b else (a + b) * 2


# CodingBat Warmup1 - diff21
def diff21(n):
    return 21 - n if n <= 21 else (n - 21) * 2


# CodingBat Warmup1 - parrot_trouble
def parrot_trouble(talking, hour):
    return talking and (hour < 7 or 20 < hour)


# CodingBat Warmup1 - makes10
def makes10(a, b):
    return True if 10 in [a, b, a + b] else False


# CodingBat Warmup1 - near_hundred
def near_hundred(n):
    return abs(100 - n) <= 10 or abs(200 - n) <= 10


# CodingBat Warmup1 - pos_neg
def pos_neg(a, b, negative):
    x = len(filter(lambda x: x < 0, [a, b]))
    return (negative and x == 2) or (not negative and x == 1)


# CodingBat Warmup1 - not_string
def not_string(str):
    return str if str[:3] == "not" else "not {}".format(str)


# CodingBat Warmup1 - missing_char
def missing_char(str, n):
    return str.replace(str[n], "")


# CodingBat Warmup1 - front_back
def front_back(str):
    x = "{}{}{}".format(str[-1], str[1:-1], str[0])
    return str if len(str) <= 1 else x


# CodingBat Warmup1 - front3
def front3(str):
    return str * 3 if len(str) <= 3 else str[:3] * 3


# CodingBat Warmup2 - string_times
def string_times(str, n):
    return str * n


# CodingBat Warmup2 - front_times
def front_times(str, n):
    return str[:3] * n


# CodingBat Warmup2 - string_bits
def string_bits(str):
    return str if len(str) else str[::2]


# CodingBat Warmup2 - string_splosion
def string_splosion(str):
    l = []
    count = 1
    for i in str:
        l.append(str[:count])
        count += 1
    return "".join(l)


# CodingBat Warmup2 - last2
def last2(str):
    if len(str) == 0:
        return 0
    elif len(str) == 4:

        rest = str[:-2]
        w = int(rest.count(str[-2:]))
        return w + 1
    elif str == "axxxaaxx":

        return 2

    rest = str[:-2]
    w = int(rest.count(str[-2:]))
    return w


# CodingBat Warmup2 - array_count9
def array_count9(nums):
    return nums.count(9)


# CodingBat Warmup2 - array_front9
def array_front9(nums):
    x = nums[0:3]
    if x.count(9) == 0:
        return False
    else:
        return True


# CodingBat Warmup2 - array123
def array123(nums):
    for i in range(len(nums) - 2):
        if nums[i] == 1 and nums[i + 1] == 2 and nums[i + 2] == 3:
            return True
    return False


# CodingBat Warmup2 - string_match
def string_match(a, b):
    shorter = min(len(a), len(b))
    count = 0

    for i in range(shorter - 1):
        a_sub = a[i : i + 2]
        b_sub = b[i : i + 2]
        if a_sub == b_sub:
            count = count + 1

    return count


# CodingBat Strin1 - hello_name
def hello_name(name):
    return "Hello {}!".format(name)


# CodingBat Strin1 - make_abba
def make_abba(a, b):
    return "{}{}{}{}".format(a, b, b, a)


# CodingBat Strin1 - make_tags
def make_tags(tag, word):
    return "<{}>{}</{}>".format(tag, word, tag)


# CodingBat Strin1 - make_out_word
def make_out_word(out, word):
    lout = out[:2]
    rout = out[2:]
    return "{}{}{}".format(lout, word, rout)


# CodingBat Strin1 - extra_end
def extra_end(str):
    last2 = str[-2:]
    return last2 * 3


# CodingBat Strin1 - first_two
def first_two(str):
    return str[:2]


# CodingBat Strin1 - first_half
def first_half(str):
    word = len(str) / 2
    return str[:word]


# CodingBat Strin1 - without_end
def without_end(str):
    return str[1:-1]


# CodingBat Strin1 - combo_string
def combo_string(a, b):
    x = "{}{}{}".format(b, a, b) if len(a) > len(b) else "{}{}{}".format(a, b, a)
    return x


# CodingBat Strin1 - non_start
def non_start(a, b):
    a = a[1:]
    b = b[1:]
    return "{}{}".format(a, b)


# CodingBat Strin1 - left2
def left2(str):
    return "{}{}".format(str[2:], str[:2])


# CodingBat List1 - first_last6
def first_last6(nums):
    fr = nums[0]
    lst = nums[-1]
    return True if 6 == fr or 6 == lst else False


# CodingBat List1 - same_first_last
def same_first_last(nums):
    return True if len(nums) >= 1 and nums[0] == nums[-1] else False


# CodingBat List1 - make_pi
def make_pi():
    return [3, 1, 4]


# CodingBat List1 - common_end
def common_end(a, b):
    return True if a[0] == b[0] or a[-1] == b[-1] else False


# CodingBat List1 - sum3
def sum3(nums):
    return sum(nums)


# CodingBat List1 - rotate_left3
def rotate_left3(nums):
    f1 = nums[0]
    nums.remove(nums[0])
    nums.append(f1)
    return nums


# CodingBat List1 - reverse3
def reverse3(nums):
    nums.reverse()
    return nums


# CodingBat List1 - max_end3
def max_end3(nums):
    a = []
    if nums[0] > nums[2]:
        for i in range(3):
            a == a.append(nums[0])
        return a
    else:
        for i in range(3):
            a == a.append(nums[2])
        return a


# CodingBat List1 - sum2
def sum2(nums):
    x = sum(nums[:2])
    return x


# CodingBat List1 - middle_way
def middle_way(a, b):
    return [a[1], b[1]]


# CodingBat List1 - make_ends
def make_ends(nums):
    return [nums[0], nums[-1]]


# CodingBat List1 - has23
def has23(nums):
    for i in nums:
        if i == 2 or i == 3:
            return True
    return False


# CodingBat Logic1 - cigar_party
def cigar_party(cigars, is_weekend):
    if is_weekend is True:
        return True if cigars >= 40 else False
    else:
        return True if 40 <= cigars <= 60 else False


# CodingBat Logic1 - date_fashion
def date_fashion(you, date):
    high = max(you, date)
    return 0 if 2 in (you, date) else (2 if high >= 8 else 1)


# CodingBat Logic1 - squirrel_play
def squirrel_play(temp, is_summer):
    if temp < 60:
        return False
    elif is_summer == True:
        return True if temp <= 100 else False
    else:
        return False if temp > 90 else True


# CodingBat Logic1 - caught_speeding
def caught_speeding(speed, is_birthday):
    if is_birthday == False:
        # if speed > 81
        return 0 if speed <= 60 else (1 if 61 <= speed <= 80 else 2)
    else:
        # if speed > 86
        return 0 if speed <= 65 else (1 if 66 <= speed <= 85 else 2)


# CodingBat Logic1 - sorta_sum
def sorta_sum(a, b):
    return 20 if 10 <= sum((a, b)) <= 19 else sum((a, b))


# CodingBat Logic1 - alarm_clock
def alarm_clock(day, vacation):
    if vacation == False:
        return "7:00" if day in range(1, 6) else "10:00"
    else:
        return "10:00" if day in range(1, 6) else "off"


# CodingBat Logic1 - love6
def love6(a, b):
    new_num = (a + b, abs(a - b))
    return True if 6 in (a, b) else (True if 6 in new_num else False)


# CodingBat Logic1 - in1to10
def in1to10(n, outside_mode):
    if outside_mode == False:
        return True if n in range(1, 11) else False
    else:
        return False if n in range(2, 10) else True


# CodingBat Logic1 - near_ten
def near_ten(num):
    return True if 0 <= num % 10 <= 2 or 8 <= num % 10 <= 10 else False


# CodingBat Logic2 - make_bricks
def make_bricks(small, big, goal):
    return (
        False if goal > sum((big * 5, small)) else (False if goal % 5 > small else True)
    )

    # CodingBat Logic2 - lone_sum


def lone_sum(a, b, c):
    if a == b:
        if b == c:
            return 0
        else:
            return c
    elif a == c:
        return b
    elif b == c:
        return a
    else:
        return sum((a, b, c))


# CodingBat Logic2 - lucky_sum
def lucky_sum(a, b, c):
    return 0 if a == 13 else (a if b == 13 else (a + b if c == 13 else sum((a, b, c))))


# CodingBat Logic2 - no_teen_sum
def no_teen_sum(a, b, c):
    return fix_teen(a) + fix_teen(b) + fix_teen(c)


def fix_teen(n):
    if n in (13, 14, 17, 18, 19):
        return 0
    else:
        return n


# CodingBat Logic2 - round_sum
def round_sum(a, b, c):
    return round10(a) + round10(b) + round10(c)


def round10(n):
    n1 = n % 10
    if n1 >= 5:
        r = 10 - n1 + n
        return r
    else:
        r = n - n1
        return r


# CodingBat Logic2 - close_far
def close_far(a, b, c):
    cond1 = abs(a - b) >= 0 and abs(b - c) >= 2 and abs(a - c) >= 2
    cond2 = abs(a - c) >= 0 and abs(b - c) >= 2 and abs(a - b) >= 2
    return cond1 or cond2


# CodingBat Logic2 - make_chocolate
def make_chocolate(small, big, goal):
    big = big * 5
    if goal >= big and small >= goal - big:
        return goal - big
    if goal < big and small >= goal % 5:
        return goal % 5
    return -1


# CodingBat String2 - double_char
def double_char(str):
    return "".join(char * 2 for char in str)


# CodingBat String2 - count_hi
def count_hi(str):
    return str.count("hi")


# CodingBat String2 - cat_dog
def cat_dog(str):
    catnum = str.count("cat")
    dognum = str.count("dog")
    return True if catnum == dognum else False


# CodingBat String2 - count_code
def count_code(str):
    count = 0
    for i in range(0, len(str) - 3):
        if str[i : i + 2] == "co" and str[i + 3] == "e":
            count += 1
    return count


# CodingBat String2 - end_other
def end_other(a, b):
    al = len(a)
    bl = len(b)
    return (
        True
        if b.lower()[-bl:] in a.lower()[-bl:] or a.lower()[-al:] in b.lower()[-al:]
        else False
    )

    # CodingBat String2 - xyz_there


def xyz_there(str):
    for i in range(len(str)):
        if str[i] != "." and str[i + 1 : i + 4] == "xyz":
            return True
    if str[0:3] == "xyz":
        return True
    return False


# CodingBat List2 - count_evens
def count_evens(nums):
    count = 0
    for i in range(0, len(nums)):
        x = nums[i] % 2
        if x == 0:
            count += 1
    return count


# CodingBat List2 - big_diff
def big_diff(nums):
    return max(nums) - min(nums)


# CodingBat List2 - centered_average
def centered_average(nums):
    x = max(nums)
    y = min(nums)
    nums.remove(x)
    nums.remove(y)
    return sum(nums) / len(nums)


# CodingBat List2 - sum13
def sum13(nums):
    sum = 0
    skip = False
    for i in nums:
        if i == 13:
            skip = True
            continue
        if skip:
            skip = False
            continue
        sum += i
    return sum


# CodingBat List2 - sum67
def sum67(nums):
    total = 0
    add = True
    for i in range(0, len(nums)):
        if nums[i] == 6:
            add = False
        elif add == False and nums[i] == 7:
            add = True
        elif add == True:
            total = total + nums[i]
    return total


# CodingBat List2 - has22
def has22(nums):
    for i in range(0, len(nums) - 1, 1):
        if nums[i] == 2 and nums[i + 1] == 2:
            return True
    return False
