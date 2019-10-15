package codewars

import "strings"

func Rot90Counter(s string) string {
	strs := strings.Split(s, "\n")
	res := []string{}
	for i := len(strs[0]) - 1; i >= 0; i-- {
		tmp := []byte{}
		for j := 0; j < len(strs); j++ {
			tmp = append(tmp, strs[j][i])
		}
		res = append(res, string(tmp))
	}
	return strings.Join(res, "\n")
}
func Diag2Sym(s string) string {
	strs := strings.Split(s, "\n")
	res := []string{}
	for i := len(strs[0]) - 1; i >= 0; i-- {
		tmp := []byte{}
		for j := len(strs) - 1; j >= 0; j-- {
			tmp = append(tmp, strs[j][i])
		}
		res = append(res, string(tmp))
	}
	return strings.Join(res, "\n")
}
func SelfieDiag2Counterclock(s string) string {
	diags := strings.Split(Diag2Sym(s), "\n")
	counters := strings.Split(Rot90Counter(s), "\n")
	strs := strings.Split(s, "\n")
	res := []string{}
	for i := 0; i < len(strs); i++ {
		res = append(res, strs[i]+"|"+diags[i]+"|"+counters[i])
	}
	return strings.Join(res, "\n")
}

type FParam func(string) string

func Oper(f FParam, x string) string {
	return f(x)
}
