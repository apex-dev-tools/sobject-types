/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Datetime;
import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.SObject;

@SuppressWarnings("unused")
public class Announcement extends SObject {
	public static SObjectType$<Announcement> SObjectType;
	public static SObjectFields$<Announcement> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Datetime ExpirationDate;
	public Id FeedItemId;
	public FeedItem FeedItem;
	public Id Id;
	public Boolean IsArchived;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id ParentId;
	public CollaborationGroup Parent;
	public Boolean SendEmails;
	public Datetime SystemModstamp;

	public Announcement clone$() {throw new UnsupportedOperationException();}
	public Announcement clone$(Boolean preserveId) {throw new UnsupportedOperationException();}
	public Announcement clone$(Boolean preserveId, Boolean isDeepClone) {throw new UnsupportedOperationException();}
	public Announcement clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new UnsupportedOperationException();}
	public Announcement clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new UnsupportedOperationException();}
}
