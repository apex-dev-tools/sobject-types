/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class WorkThanks extends SObject {
	public static SObjectType$<WorkThanks> SObjectType;
	public static SObjectFields$<WorkThanks> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id FeedItemId;
	public FeedItem FeedItem;
	public Id GiverId;
	public User Giver;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Message;
	public Id OwnerId;
	public Name Owner;
	public Datetime SystemModstamp;

	public WorkBadge[] Badges;
	public WorkThanksShare[] Shares;

	public WorkThanks clone$() {throw new java.lang.UnsupportedOperationException();}
	public WorkThanks clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WorkThanks clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WorkThanks clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WorkThanks clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
