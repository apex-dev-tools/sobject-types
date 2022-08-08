/*
 Copyright (c) 2019 Kevin Jones, All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class EntityParticle extends SObject {
	public static SObjectType$<EntityParticle> SObjectType;
	public static SObjectFields$<EntityParticle> Fields;

	public com.nawforce.runforce.System.Integer ByteLength;
	public com.nawforce.runforce.System.String DataType;
	public com.nawforce.runforce.System.String DefaultValueFormula;
	public com.nawforce.runforce.System.String DeveloperName;
	public com.nawforce.runforce.System.Integer Digits;
	public com.nawforce.runforce.System.String DurableId;
	public com.nawforce.runforce.System.String EntityDefinitionId;
	public com.nawforce.runforce.System.String ExtraTypeInfo;
	public com.nawforce.runforce.System.String FieldDefinitionId;
	public Id Id;
	public com.nawforce.runforce.System.String InlineHelpText;
	public com.nawforce.runforce.System.Boolean IsApiFilterable;
	public com.nawforce.runforce.System.Boolean IsApiGroupable;
	public com.nawforce.runforce.System.Boolean IsApiSortable;
	public com.nawforce.runforce.System.Boolean IsAutonumber;
	public com.nawforce.runforce.System.Boolean IsCalculated;
	public com.nawforce.runforce.System.Boolean IsCaseSensitive;
	public com.nawforce.runforce.System.Boolean IsCompactLayoutable;
	public com.nawforce.runforce.System.Boolean IsComponent;
	public com.nawforce.runforce.System.Boolean IsCompound;
	public com.nawforce.runforce.System.Boolean IsCreatable;
	public com.nawforce.runforce.System.Boolean IsDefaultedOnCreate;
	public com.nawforce.runforce.System.Boolean IsDependentPicklist;
	public com.nawforce.runforce.System.Boolean IsDeprecatedAndHidden;
	public com.nawforce.runforce.System.Boolean IsDisplayLocationInDecimal;
	public com.nawforce.runforce.System.Boolean IsEncrypted;
	public com.nawforce.runforce.System.Boolean IsFieldHistoryTracked;
	public com.nawforce.runforce.System.Boolean IsHighScaleNumber;
	public com.nawforce.runforce.System.Boolean IsHtmlFormatted;
	public com.nawforce.runforce.System.Boolean IsIdLookup;
	public com.nawforce.runforce.System.Boolean IsLayoutable;
	public com.nawforce.runforce.System.Boolean IsListVisible;
	public com.nawforce.runforce.System.Boolean IsNameField;
	public com.nawforce.runforce.System.Boolean IsNamePointing;
	public com.nawforce.runforce.System.Boolean IsNillable;
	public com.nawforce.runforce.System.Boolean IsPermissionable;
	public com.nawforce.runforce.System.Boolean IsUnique;
	public com.nawforce.runforce.System.Boolean IsUpdatable;
	public com.nawforce.runforce.System.Boolean IsWorkflowFilterable;
	public com.nawforce.runforce.System.Boolean IsWriteRequiresMasterRead;
	public com.nawforce.runforce.System.String Label;
	public com.nawforce.runforce.System.Integer Length;
	public com.nawforce.runforce.System.String Mask;
	public com.nawforce.runforce.System.String MaskType;
	public com.nawforce.runforce.System.String MasterLabel;
	public com.nawforce.runforce.System.String Name;
	public com.nawforce.runforce.System.String NamespacePrefix;
	public com.nawforce.runforce.System.Integer Precision;
	public com.nawforce.runforce.System.String QualifiedApiName;
	public com.nawforce.runforce.System.String ReferenceTargetField;
	public Object ReferenceTo;
	public com.nawforce.runforce.System.String RelationshipName;
	public com.nawforce.runforce.System.Integer RelationshipOrder;
	public com.nawforce.runforce.System.Integer Scale;
	public com.nawforce.runforce.System.String ServiceDataTypeId;
	public com.nawforce.runforce.System.String ValueTypeId;

	public PicklistValueInfo[] PicklistValues;

	public EntityParticle clone$() {throw new java.lang.UnsupportedOperationException();}
	public EntityParticle clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EntityParticle clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EntityParticle clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EntityParticle clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
