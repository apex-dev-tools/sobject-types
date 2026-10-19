/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class DevopsTestProvider extends SObject {
	public static SObjectType$<DevopsTestProvider> SObjectType;
	public static SObjectFields$<DevopsTestProvider> Fields;

	public String ApexClassIdentifier;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public String DeveloperName;
	public String Icon;
	public Id Id;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LearnMoreUrl;
	public String MasterLabel;
	public String NamespacePrefix;
	public Datetime SystemModstamp;
	public String TestProviderUrl;

	public DevopsTestSuite[] DevopsTestSuites;
	public DevopsTest[] DevopsTests;

	public DevopsTestProvider clone$() {throw new java.lang.UnsupportedOperationException();}
	public DevopsTestProvider clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DevopsTestProvider clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DevopsTestProvider clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DevopsTestProvider clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
