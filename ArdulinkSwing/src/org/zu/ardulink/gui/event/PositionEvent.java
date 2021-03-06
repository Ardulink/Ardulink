/**
Copyright 2013 Luciano Zu project Ardulink http://www.ardulink.org/

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

@author Luciano Zu
*/

package org.zu.ardulink.gui.event;

import java.awt.Point;

/**
 * [ardulinktitle] [ardulinkversion]
 * @author Luciano Zu project Ardulink http://www.ardulink.org/
 * 
 * [adsense]
 */
public class PositionEvent {
	
	private String id;
	private Point position;
	private int maxSize;

	public PositionEvent(Point position, int maxSize, String id) {
		super();
		this.position = position;
		this.maxSize = maxSize;
		this.id = id;
	}

	public Point getPosition() {
		return position;
	}

	public int getMaxSize() {
		return maxSize;
	}

	public String getId() {
		return id;
	}
}
