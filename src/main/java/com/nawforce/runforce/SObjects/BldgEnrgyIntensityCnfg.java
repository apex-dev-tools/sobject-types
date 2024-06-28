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
public class BldgEnrgyIntensityCnfg extends SObject {
	public static SObjectType$<BldgEnrgyIntensityCnfg> SObjectType;
	public static SObjectFields$<BldgEnrgyIntensityCnfg> Fields;

	public String BuildingEnergyIntensityType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeveloperName;
	public Id Id;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public Id RecordTypeId;
	public RecordType RecordType;
	public Datetime SystemModstamp;

	public BldgEnrgyIntensityCnfg clone$() {throw new java.lang.UnsupportedOperationException();}
	public BldgEnrgyIntensityCnfg clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public BldgEnrgyIntensityCnfg clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public BldgEnrgyIntensityCnfg clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public BldgEnrgyIntensityCnfg clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
