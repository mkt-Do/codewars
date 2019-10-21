package codewars

import "math"

func Interp(f func(float64) float64, l float64, u float64, n int) []float64 {
	d := (u - l) / float64(n)
	res := []float64{}
	dist := l
	for {
		v := f(dist)
		if v > 0 {
			res = append(res, math.Trunc(v*100)/100)
		} else {
			res = append(res, math.Ceil(v*-100)/-100)
		}
		if len(res) == n {
			break
		}
		dist = dist + d
	}
	return res
}
