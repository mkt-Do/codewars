package codewars

import "strings"

func PosAverage(s string) float64 {
	strs := strings.Split(s, ", ")
	alllength := (len(strs) * (len(strs) - 1) / 2) * len(strs[0])
	cnt := 0
	for n := 0; n < len(strs)-1; n++ {
		for m := n + 1; m < len(strs); m++ {
			sa := strs[n]
			sb := strs[m]
			for i := 0; i < len(sa); i++ {
				if sa[i] == sb[i] {
					cnt++
				}
			}
		}
	}
	return float64(cnt*100) / float64(alllength)
}
