/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class AttribModel extends SObject {
	public static SObjectType$<AttribModel> SObjectType;
	public static SObjectFields$<AttribModel> Fields;

	public String AttribModelStatus;
	public String AttribRecordOutputObjectApiName;
	public String AttributionModelType;
	public String AttributionType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DataSpaceId;
	public DataSpace DataSpace;
	public String Description;
	public String DeveloperName;
	public String ErrorCode;
	public Integer GlobalAttributionWindowDays;
	public Id Id;
	public String IdentityResolutionMode;
	public Boolean IsDeleted;
	public Boolean IsZeroDayLoadRequired;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastRefresh;
	public Datetime LastSuccessfulRefresh;
	public Datetime LastViewedDate;
	public String LatestRefreshedStatus;
	public String ModelContext;
	public Integer ModelRevision;
	public Integer ModelVersion;
	public String Name;
	public String Partner;
	public Id ProfileDataGraphId;
	public DataGraph ProfileDataGraph;
	public Integer ScheduledFrequencyMins;
	public String SyncStatus;
	public Datetime SystemModstamp;
	public String Tags;

	public AttribModelOutput[] AttribModelOutputs;
	public AttribModelRelatedType[] AttribModelRelatedTypes;
	public AttribModelStage[] AttribModelStages;

	public AttribModel clone$() {throw new java.lang.UnsupportedOperationException();}
	public AttribModel clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AttribModel clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AttribModel clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AttribModel clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
