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
public class ChatterExtension extends SObject {
	public static SObjectType$<ChatterExtension> SObjectType;
	public static SObjectFields$<ChatterExtension> Fields;

	public String CompositionComponentEnumOrId;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public String DeveloperName;
	public String ExtensionName;
	public String HeaderText;
	public String HoverText;
	public Id IconId;
	public ContentAsset Icon;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsProtected;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public String RenderComponentEnumOrId;
	public Datetime SystemModstamp;
	public String Type;

	public ChatterExtensionLocalization[] Localization;

	public ChatterExtension clone$() {throw new java.lang.UnsupportedOperationException();}
	public ChatterExtension clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ChatterExtension clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ChatterExtension clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ChatterExtension clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
