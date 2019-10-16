package codewars

func Comp(array1 []int, array2 []int) bool {
	if array1 == nil || array2 == nil || len(array1) != len(array2) {
		return false
	}
	squaredArr := array2
	for _, a := range array1 {
		i, t := Contain(a, squaredArr)
		if !t {
			return false
		}
		squaredArr = Delete(i, squaredArr)
	}
	return true
}

func Contain(a int, arr []int) (int, bool) {
	for i, e := range arr {
		if e == a*a {
			return i, true
		}
	}
	return -1, false
}

func Delete(i int, arr []int) []int {
	a := append(arr[:i], arr[i+1:]...)
	res := make([]int, len(a))
	copy(res, a)
	return res
}
