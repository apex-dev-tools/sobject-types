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
public class IntegrationProviderDef extends SObject {
	public static SObjectType$<IntegrationProviderDef> SObjectType;
	public static SObjectFields$<IntegrationProviderDef> Fields;

	public Id ApexClassId;
	public ApexClass ApexClass;
	public Boolean CanUseInIntegrationOrch;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public String DeveloperName;
	public String ExternalServiceOperationName;
	public String FileBasedApexClass;
	public String FileBasedExternalService;
	public String FileBasedInputDataProcessor;
	public String FileBasedOutputDataProcessor;
	public Id Id;
	public Id InputDataProcessorId;
	public OmniIntegrationProcConfig InputDataProcessor;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public Boolean IsManual;
	public Boolean IsServiceTypeIntegration;
	public String JavaClassName;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public Id OmniUiCardConfigId;
	public OmniUiCardConfig OmniUiCardConfig;
	public Id OutputDataProcessorId;
	public OmniIntegrationProcConfig OutputDataProcessor;
	public String StorePayload;
	public Datetime SystemModstamp;
	public String Type;

	public IntegrationProviderAttr[] IntegrationProviderAttrs;
	public IntegrationProviderDcsnRqmt[] IntegrationProviderDcsnRqmts;
	public IntegrationProviderExecution[] IntegrationProviderExecutions;

	public IntegrationProviderDef clone$() {throw new java.lang.UnsupportedOperationException();}
	public IntegrationProviderDef clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public IntegrationProviderDef clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public IntegrationProviderDef clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public IntegrationProviderDef clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
