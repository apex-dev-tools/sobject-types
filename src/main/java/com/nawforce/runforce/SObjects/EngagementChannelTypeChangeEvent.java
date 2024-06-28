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
public class EngagementChannelTypeChangeEvent extends SObject {
	public static SObjectType$<EngagementChannelTypeChangeEvent> SObjectType;
	public static SObjectFields$<EngagementChannelTypeChangeEvent> Fields;

	public Object ChangeEventHeader;
	public String ContactPointType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsActive;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String ReplayId;
	public String UsageType;

	public EngagementChannelTypeChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public EngagementChannelTypeChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EngagementChannelTypeChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EngagementChannelTypeChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EngagementChannelTypeChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
