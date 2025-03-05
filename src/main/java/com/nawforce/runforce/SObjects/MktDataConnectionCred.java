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
public class MktDataConnectionCred extends SObject {
	public static SObjectType$<MktDataConnectionCred> SObjectType;
	public static SObjectFields$<MktDataConnectionCred> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CredentialName;
	public String DeveloperName;
	public Id Id;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public Id MktDataConnectionId;
	public MktDataConnection MktDataConnection;
	public Id NamedCredentialId;
	public NamedCredential NamedCredential;
	public Datetime SystemModstamp;
	public String Value;

	public MktDataConnectionCred clone$() {throw new java.lang.UnsupportedOperationException();}
	public MktDataConnectionCred clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MktDataConnectionCred clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MktDataConnectionCred clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MktDataConnectionCred clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
