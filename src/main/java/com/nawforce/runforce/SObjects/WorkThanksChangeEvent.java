/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class WorkThanksChangeEvent extends SObject {
	public static SObjectType$<WorkThanksChangeEvent> SObjectType;
	public static SObjectFields$<WorkThanksChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id FeedItemId;
	public FeedItem FeedItem;
	public Id GiverId;
	public User Giver;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Message;
	public Id OwnerId;
	public User Owner;
	public String ReplayId;

	public WorkThanksChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public WorkThanksChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WorkThanksChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WorkThanksChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WorkThanksChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
