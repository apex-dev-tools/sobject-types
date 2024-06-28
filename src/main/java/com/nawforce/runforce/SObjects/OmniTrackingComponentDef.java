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
public class OmniTrackingComponentDef extends SObject {
	public static SObjectType$<OmniTrackingComponentDef> SObjectType;
	public static SObjectFields$<OmniTrackingComponentDef> Fields;

	public String ComponentType;
	public Decimal ComponentVersion;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeveloperName;
	public Id Id;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastRunDate;
	public String MasterLabel;
	public String MqJob;
	public String MqJobStatus;
	public String OmniTrackingComponentDefKey;
	public Id OmniTrackingGroupId;
	public OmniTrackingGroup OmniTrackingGroup;
	public String PayloadOutput;
	public Datetime SystemModstamp;

	public OmniTrackingComponentDef clone$() {throw new java.lang.UnsupportedOperationException();}
	public OmniTrackingComponentDef clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OmniTrackingComponentDef clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OmniTrackingComponentDef clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OmniTrackingComponentDef clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
