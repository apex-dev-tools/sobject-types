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
public class OmniExtTrackingDef extends SObject {
	public static SObjectType$<OmniExtTrackingDef> SObjectType;
	public static SObjectFields$<OmniExtTrackingDef> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public String DeveloperName;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String OmniExtTrackingDefKey;
	public Datetime SystemModstamp;
	public String TrackingFrameworkInformation;
	public String TrackingServiceProvider;

	public OmniTrackingGroup[] ExtTrackingConfigDefs;
	public OmniExtTrackingEventDef[] OmniExtTrackingDefs;

	public OmniExtTrackingDef clone$() {throw new java.lang.UnsupportedOperationException();}
	public OmniExtTrackingDef clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OmniExtTrackingDef clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OmniExtTrackingDef clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OmniExtTrackingDef clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
