/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

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
