/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

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
