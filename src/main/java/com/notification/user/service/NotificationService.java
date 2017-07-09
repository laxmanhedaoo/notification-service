/** 
 * This program is free: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.notification.user.service;

import java.util.List;

import com.common.entity.Notification;
import com.common.entity.Subscriber;
import com.common.service.Service;

@org.springframework.stereotype.Service
public class NotificationService implements Service {

	/**
	 * @param subscriber
	 * @return
	 */
	public Boolean subscribe(Subscriber subscriber){
		
		return false;
	}
	/**
	 * @param subscribers
	 * @param notification
	 */
	public void notify(List<Subscriber> subscribers,Notification notification){
		
	}
}
