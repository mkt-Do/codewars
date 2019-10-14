package codewars

import "math"

func Gps(s int, x []float64) int {
	diff := []float64{}
	for i := 0; i < len(x)-1; i++ {
		diff = append(diff, math.Abs(x[i]-x[i+1])*3600.0/float64(s))
	}
	return int(Max(diff))
}

func Max(arr []float64) float64 {
	max := 0.0
	for _, elem := range arr {
		if elem > max {
			max = elem
		}
	}
	return max
}
