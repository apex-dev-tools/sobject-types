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
public class MsgChannelUsageExternalOrg extends SObject {
	public static SObjectType$<MsgChannelUsageExternalOrg> SObjectType;
	public static SObjectFields$<MsgChannelUsageExternalOrg> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String ExternalOrgIdentifier;
	public String ExternalSubOrgIdentifier;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id MessagingChannelUsageId;
	public MessagingChannelUsage MessagingChannelUsage;
	public Datetime SystemModstamp;

	public MsgChannelUsageExternalOrg clone$() {throw new java.lang.UnsupportedOperationException();}
	public MsgChannelUsageExternalOrg clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MsgChannelUsageExternalOrg clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MsgChannelUsageExternalOrg clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MsgChannelUsageExternalOrg clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
