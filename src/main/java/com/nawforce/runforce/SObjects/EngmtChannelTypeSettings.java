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
public class EngmtChannelTypeSettings extends SObject {
	public static SObjectType$<EngmtChannelTypeSettings> SObjectType;
	public static SObjectFields$<EngmtChannelTypeSettings> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeveloperName;
	public String EngagementChannelType;
	public Id Id;
	public Boolean IsDeleted;
	public String IsSettingEnabled;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String SettingKey;
	public Datetime SystemModstamp;

	public EngmtChannelTypeSettings clone$() {throw new java.lang.UnsupportedOperationException();}
	public EngmtChannelTypeSettings clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EngmtChannelTypeSettings clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EngmtChannelTypeSettings clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EngmtChannelTypeSettings clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
