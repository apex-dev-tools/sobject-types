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
public class Folder extends SObject {
	public static SObjectType$<Folder> SObjectType;
	public static SObjectFields$<Folder> Fields;

	public String AccessType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeveloperName;
	public Id Id;
	public Boolean IsReadonly;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String NamespacePrefix;
	public Id ParentId;
	public Folder Parent;
	public Datetime SystemModstamp;
	public String Type;

	public Macro[] MacroFolders;
	public QuickText[] QuickTextFolders;
	public DocGenerationQueryResult[] DocGenerationQueryResults;
	public Folder[] SubFolders;

	public Folder clone$() {throw new java.lang.UnsupportedOperationException();}
	public Folder clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Folder clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Folder clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Folder clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
