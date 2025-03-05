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
public class DataRemoteOrgDataSpaceMap extends SObject {
	public static SObjectType$<DataRemoteOrgDataSpaceMap> SObjectType;
	public static SObjectFields$<DataRemoteOrgDataSpaceMap> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id DataMultiOrgConnectionId;
	public DataMultiOrgConnection DataMultiOrgConnection;
	public String DataSpaceSyncStatus;
	public String DayZeroGenerationErrors;
	public String DeveloperName;
	public Id Id;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String RecordSynStatus;
	public Datetime SystemModstamp;

	public DataRemoteOrgDataSpaceMap clone$() {throw new java.lang.UnsupportedOperationException();}
	public DataRemoteOrgDataSpaceMap clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DataRemoteOrgDataSpaceMap clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DataRemoteOrgDataSpaceMap clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DataRemoteOrgDataSpaceMap clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
