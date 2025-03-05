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
public class MktDataConnection extends SObject {
	public static SObjectType$<MktDataConnection> SObjectType;
	public static SObjectFields$<MktDataConnection> Fields;

	public String ConnectionMethod;
	public String ConnectionState;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DataConnectorType;
	public String DeveloperName;
	public String ExternalRecordIdentifier;
	public Id Id;
	public Boolean IsDeleted;
	public String Language;
	public String LastDataChangeStatusErrorCode;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastSyncDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public String SyncStatus;
	public Datetime SystemModstamp;

	public ActivationTarget[] DataConConfigs;
	public MktDataConnectionCred[] MktDataConnectionCreds;
	public MktDataConnectionParam[] MktDataConnectionParams;

	public MktDataConnection clone$() {throw new java.lang.UnsupportedOperationException();}
	public MktDataConnection clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MktDataConnection clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MktDataConnection clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MktDataConnection clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
