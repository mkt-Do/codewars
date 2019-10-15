package codewars

import "strings"

func Rot(s string) string {
	rev := []byte{}
	for i := len(s) - 1; i >= 0; i-- {
		rev = append(rev, s[i])
	}
	return string(rev)
}

func SelfieAndRot(s string) string {
	rev := []byte{}
	strs := []string{}
	for _, str := range strings.Split(s, "\n") {
		strs = append(strs, str+strings.Repeat(".", len(str)))
	}
	newstr := strings.Join(strs, "\n")
	for i := len(newstr) - 1; i >= 0; i-- {
		rev = append(rev, newstr[i])
	}
	return newstr + "\n" + string(rev)
}

type FParam func(string) string

func Oper(f FParam, x string) string {
	return f(x)
}
