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
public class OmniExtTrackingEventDef extends SObject {
	public static SObjectType$<OmniExtTrackingEventDef> SObjectType;
	public static SObjectFields$<OmniExtTrackingEventDef> Fields;

	public String ComponentType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public String DeveloperName;
	public Id Id;
	public String InclusionRule;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public Id OmniExtTrackingDefId;
	public OmniExtTrackingDef OmniExtTrackingDef;
	public String OmniExtTrackingEventDefKey;
	public String PayloadTemplate;
	public Datetime SystemModstamp;

	public OmniExtTrackingEventDef clone$() {throw new java.lang.UnsupportedOperationException();}
	public OmniExtTrackingEventDef clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OmniExtTrackingEventDef clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OmniExtTrackingEventDef clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OmniExtTrackingEventDef clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
