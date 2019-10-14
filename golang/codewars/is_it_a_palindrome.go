package codewars

import "strings"

func IsPalindrome(str string) bool {
	rev := []string{}
	lowerStr := strings.ToLower(str)
	for i := len(lowerStr) - 1; i >= 0; i-- {
		rev = append(rev, string(lowerStr[i]))
	}
	return strings.Join(rev, "") == lowerStr
}
