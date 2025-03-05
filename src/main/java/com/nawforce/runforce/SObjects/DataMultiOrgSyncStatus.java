/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Long;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

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
	public Datetime SystemModstamp;

	public DataMultiOrgSyncStatus clone$() {throw new java.lang.UnsupportedOperationException();}
	public DataMultiOrgSyncStatus clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DataMultiOrgSyncStatus clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DataMultiOrgSyncStatus clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DataMultiOrgSyncStatus clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
