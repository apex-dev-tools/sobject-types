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
public class CommSubscriptionChannelTypeChangeEvent extends SObject {
	public static SObjectType$<CommSubscriptionChannelTypeChangeEvent> SObjectType;
	public static SObjectFields$<CommSubscriptionChannelTypeChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CommunicationSubscriptionId;
	public CommSubscription CommunicationSubscription;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DataUsePurposeId;
	public CommSubscription DataUsePurpose;
	public Id EngagementChannelTypeId;
	public EngagementChannelType EngagementChannelType;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id MessagingChannelId;
	public MessagingChannel MessagingChannel;
	public Id MessagingChannelUsageId;
	public MessagingChannelUsage MessagingChannelUsage;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String ReplayId;

	public CommSubscriptionChannelTypeChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CommSubscriptionChannelTypeChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CommSubscriptionChannelTypeChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CommSubscriptionChannelTypeChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CommSubscriptionChannelTypeChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
