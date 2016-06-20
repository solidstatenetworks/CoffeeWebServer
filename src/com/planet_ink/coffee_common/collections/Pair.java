package com.planet_ink.coffee_common.collections;

/*
Copyright 2000-2016 Bo Zimmerman

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

	http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

/**
 * A trivial pojo for grouping pairs of things, usually for collections.
 * @author Bo Zimmerman
 */
public class Pair<T,K> 
{
	public T first;
	public K second;
	public Pair(T frst, K scnd)
	{
		first=frst;
		second=scnd;
	}
}
