/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.Long;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class DataMultiOrgSyncStatus extends SObject {
	public static SObjectType$<DataMultiOrgSyncStatus> SObjectType;
	public static SObjectFields$<DataMultiOrgSyncStatus> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id DataMultiOrgConnectionId;
	public DataMultiOrgConnection DataMultiOrgConnection;
	public String DataSpaceName;
	public String DataSpaceSyncStatus;
	public String DeveloperName;
	public String Errors;
	public Id Id;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Long LastProcessedGroupVersion;
	public Long LastProcessedTransaction;
	public String LastSchemaFingerprint;
	public Datetime LastSyncedOn;
	public String MasterLabel;
	public String MetadataSynStatus;
	public String MultiOrgChangeSetType;
	public String OwnedByOrg;
	public String RecordSynStatus;
	public Integer ReplayFailureCount;
	public Datetime SystemModstamp;

	public DataMultiOrgSyncStatus clone$() {throw new java.lang.UnsupportedOperationException();}
	public DataMultiOrgSyncStatus clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DataMultiOrgSyncStatus clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DataMultiOrgSyncStatus clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DataMultiOrgSyncStatus clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
