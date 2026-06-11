/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class MessagingChannelUsage extends SObject {
	public static SObjectType$<MessagingChannelUsage> SObjectType;
	public static SObjectFields$<MessagingChannelUsage> Fields;

	public String ConsentType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeploymentStatus;
	public String DeploymentType;
	public Datetime DisabledTime;
	public String ErrorDetails;
	public String ErrorReason;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id MessagingChannelId;
	public MessagingChannel MessagingChannel;
	public String RoutingOverride;
	public Datetime SystemModstamp;

	public CommSubscriptionChannelType[] MessagingChannelUsages;

	public MessagingChannelUsage clone$() {throw new java.lang.UnsupportedOperationException();}
	public MessagingChannelUsage clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MessagingChannelUsage clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MessagingChannelUsage clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MessagingChannelUsage clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
