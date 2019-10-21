package codewars

import (
	"strconv"
	"strings"
)

func FromNbToStr(n int64, sys []int64) string {
	prod := int64(1)
	for _, v := range sys {
		prod *= v
	}
	if prod < n {
		return "Not applicable"
	}

	for i := 0; i < len(sys)-1; i++ {
		for j := i + 1; j < len(sys); j++ {
			if sys[i] == sys[j] || Euclid(sys[i], sys[j]) != 1 {
				return "Not applicable"
			}
		}
	}

	res := []string{}
	for _, v := range sys {
		res = append(res, strconv.FormatInt(n%v, 10))
	}

	return "-" + strings.Join(res, "--") + "-"
}

func Euclid(a, b int64) int64 {
	var tmpa int64
	var tmpb int64
	if a > b {
		tmpa = a
		tmpb = b
	} else {
		tmpa = b
		tmpb = a
	}
	for {
		tmp := tmpa % tmpb
		if tmp == 0 {
			break
		}
		tmpa = tmpb
		tmpb = tmp
	}
	return tmpb
}
