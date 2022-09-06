/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class UserProvisioningConfig extends SObject {
	public static SObjectType$<UserProvisioningConfig> SObjectType;
	public static SObjectFields$<UserProvisioningConfig> Fields;

	public String ApprovalRequired;
	public Id ConnectedAppId;
	public ConnectedApplication ConnectedApp;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeveloperName;
	public Boolean Enabled;
	public String EnabledOperations;
	public Id Id;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReconDateTime;
	public String MasterLabel;
	public Id NamedCredentialId;
	public NamedCredential NamedCredential;
	public String NamespacePrefix;
	public String Notes;
	public String OnUpdateAttributes;
	public String ReconFilter;
	public Datetime SystemModstamp;
	public String UserAccountMapping;

	public UserProvisioningConfig clone$() {throw new java.lang.UnsupportedOperationException();}
	public UserProvisioningConfig clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public UserProvisioningConfig clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public UserProvisioningConfig clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public UserProvisioningConfig clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
