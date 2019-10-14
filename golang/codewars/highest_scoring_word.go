package codewars

import "strings"

func High(s string) string {
	strs := strings.Split(strings.ToLower(s), " ")
	maxIndex := 0
	max := 0
	for i, str := range strs {
		point := 0
		for _, c := range str {
			point += int(c) - 96
		}
		if point > max {
			max = point
			maxIndex = i
		}
	}
	return strs[maxIndex]
}
