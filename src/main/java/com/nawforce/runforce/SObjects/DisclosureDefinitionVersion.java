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
public class DisclosureDefinitionVersion extends SObject {
	public static SObjectType$<DisclosureDefinitionVersion> SObjectType;
	public static SObjectFields$<DisclosureDefinitionVersion> Fields;

	public String AuthoringMode;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public String DeveloperName;
	public String DisclosureDefinition;
	public String DocumentTemplateGlobalKey;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsCurrentVersion;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public String OmniScriptCnfgApiName;
	public String OmniScriptConfiguration;
	public Datetime SystemModstamp;
	public String VersionNumber;

	public Disclosure[] DisclosureDefinitionVersions;

	public DisclosureDefinitionVersion clone$() {throw new java.lang.UnsupportedOperationException();}
	public DisclosureDefinitionVersion clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DisclosureDefinitionVersion clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DisclosureDefinitionVersion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DisclosureDefinitionVersion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
