const mergeIntervals = (intervals) => {
  intervals.sort((a, b) => a[0] - b[0]);
  const res = [];

  let cur_interval = intervals[0];

  for (let i = 1; i < intervals.length; i++) {
    const _interval = intervals[i];
    // merge into cur_interval
    if (cur_interval[1] >= _interval[0]) {
      cur_interval = [cur_interval[0], Math.max(_interval[1], cur_interval[1])];
    } else {
      // no overlap => push to result
      res.push(cur_interval);
      cur_interval = _interval;
    }
  }
  res.push(cur_interval);
  return res;
};
