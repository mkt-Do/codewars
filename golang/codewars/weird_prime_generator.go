package codewars

func CountOnes(n int64) int {
	an := GenerateNumSeq(n)
	gn := GenerateDiffSeq(an)
	cnt := 0
	for _, v := range gn {
		if v == int64(1) {
			cnt++
		}
	}
	return cnt
}
func MaxPn(n int64) int64 {
	pn := GeneratePrimeSeq(n)
	max := int64(0)
	for _, v := range pn {
		if v > max {
			max = v
		}
	}
	return max
}
func AnOverAverage(n int64) int {
	ovs := GenerateAnOverSeq(n)
	avg := int64(0)
	for _, v := range ovs {
		avg += v
	}
	return int(avg / int64(len(ovs)))
}

func Gcd(n, m int64) int64 {
	a := n
	b := m
	for {
		if a%b == 0 {
			break
		}
		rem := a % b
		a = b
		b = rem
	}
	return b
}

func GenerateNumSeq(n int64) []int64 {
	res := []int64{7}
	for i := int64(1); i < n; i++ {
		res = append(res, res[i-1]+Gcd(i+1, res[i-1]))
	}
	return res
}

func GenerateDiffSeq(arr []int64) []int64 {
	res := []int64{1}
	for i := int64(1); i < int64(len(arr)); i++ {
		res = append(res, arr[i]-arr[i-1])
	}
	return res
}

func GeneratePrimeSeq(n int64) []int64 {
	res := []int64{}
	an := []int64{7}
	gn := []int64{1}
	i := int64(1)
	for {
		an = append(an, an[i-1]+Gcd(i+1, an[i-1]))
		gn = append(gn, an[i]-an[i-1])
		if t := isPrime(gn[i]); t {
			if b := Contain(gn[i], res); !b {
				res = append(res, gn[i])
			}
		}
		if int64(len(res)) == n {
			break
		}
		i++
	}
	return res
}

func Contain(n int64, arr []int64) bool {
	for _, v := range arr {
		if v == n {
			return true
		}
	}
	return false
}

func GenerateAnOverSeq(n int64) []int64 {
	res := []int64{}
	an := []int64{7}
	gn := []int64{1}
	i := int64(1)
	for {
		an = append(an, an[i-1]+Gcd(i+1, an[i-1]))
		gn = append(gn, an[i]-an[i-1])
		if gn[i] != 1 {
			res = append(res, an[i]/i)
		}
		if int64(len(res)) == n {
			break
		}
		i++
	}
	return res
}

func isPrime(n int64) bool {
	if n <= int64(1) {
		return false
	}
	res := []int64{}
	for i := int64(1); i <= n; i++ {
		if n%i == 0 {
			res = append(res, i)
		}
	}
	if len(res) == 2 && res[0] == 1 && res[1] == n {
		return true
	}
	return false
}
