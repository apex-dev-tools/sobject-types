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
public class ExternalClientApplication extends SObject {
	public static SObjectType$<ExternalClientApplication> SObjectType;
	public static SObjectFields$<ExternalClientApplication> Fields;

	public String ContactEmail;
	public String ContactPhone;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public String DeveloperName;
	public String DistributionState;
	public String IconUrl;
	public Id Id;
	public String InfoUrl;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LogoUrl;
	public String ManagedCollection;
	public String ManagedSetupPointer;
	public String ManagedType;
	public String MasterLabel;
	public String NamespacePrefix;
	public String OrgScopedExternalApp;
	public Datetime SystemModstamp;
	public String Version;

	public CustomPermission[] ExternalClientApplications;
	public ExtlClntAppSamplePlcyCnfg[] ExtlClntAppSamplePlcyCnfgs;
	public SetupEntityAccess[] SetupEntityAccessItems;

	public ExternalClientApplication clone$() {throw new java.lang.UnsupportedOperationException();}
	public ExternalClientApplication clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ExternalClientApplication clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ExternalClientApplication clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ExternalClientApplication clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
