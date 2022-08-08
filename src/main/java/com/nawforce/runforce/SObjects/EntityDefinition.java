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

import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class EntityDefinition extends SObject {
	public static SObjectType$<EntityDefinition> SObjectType;

	public com.nawforce.runforce.System.String DefaultCompactLayoutId;
	public com.nawforce.runforce.System.String DefaultImplementation;
	public com.nawforce.runforce.System.String DeploymentStatus;
	public com.nawforce.runforce.System.String DetailUrl;
	public com.nawforce.runforce.System.String DeveloperName;
	public com.nawforce.runforce.System.String DurableId;
	public com.nawforce.runforce.System.String EditDefinitionUrl;
	public com.nawforce.runforce.System.String EditUrl;
	public com.nawforce.runforce.System.String ExtendedBy;
	public com.nawforce.runforce.System.String ExtendsInterfaces;
	public com.nawforce.runforce.System.String ExternalSharingModel;
	public com.nawforce.runforce.System.Boolean HasSubtypes;
	public com.nawforce.runforce.System.String HelpSettingPageName;
	public com.nawforce.runforce.System.String HelpSettingPageUrl;
	public Id Id;
	public com.nawforce.runforce.System.String ImplementedBy;
	public com.nawforce.runforce.System.String ImplementsInterfaces;
	public com.nawforce.runforce.System.String InternalSharingModel;
	public com.nawforce.runforce.System.Boolean IsApexTriggerable;
	public com.nawforce.runforce.System.Boolean IsAutoActivityCaptureEnabled;
	public com.nawforce.runforce.System.Boolean IsCompactLayoutable;
	public com.nawforce.runforce.System.Boolean IsCustomSetting;
	public com.nawforce.runforce.System.Boolean IsCustomizable;
	public com.nawforce.runforce.System.Boolean IsDeprecatedAndHidden;
	public com.nawforce.runforce.System.Boolean IsEverCreatable;
	public com.nawforce.runforce.System.Boolean IsEverDeletable;
	public com.nawforce.runforce.System.Boolean IsEverUpdatable;
	public com.nawforce.runforce.System.Boolean IsFeedEnabled;
	public com.nawforce.runforce.System.Boolean IsIdEnabled;
	public com.nawforce.runforce.System.Boolean IsInterface;
	public com.nawforce.runforce.System.Boolean IsLayoutable;
	public com.nawforce.runforce.System.Boolean IsMruEnabled;
	public com.nawforce.runforce.System.Boolean IsProcessEnabled;
	public com.nawforce.runforce.System.Boolean IsQueryable;
	public com.nawforce.runforce.System.Boolean IsReplicateable;
	public com.nawforce.runforce.System.Boolean IsRetrieveable;
	public com.nawforce.runforce.System.Boolean IsSearchLayoutable;
	public com.nawforce.runforce.System.Boolean IsSearchable;
	public com.nawforce.runforce.System.Boolean IsSubtype;
	public com.nawforce.runforce.System.Boolean IsTriggerable;
	public com.nawforce.runforce.System.Boolean IsWorkflowEnabled;
	public com.nawforce.runforce.System.String KeyPrefix;
	public com.nawforce.runforce.System.String Label;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public com.nawforce.runforce.System.String MasterLabel;
	public com.nawforce.runforce.System.String NamespacePrefix;
	public com.nawforce.runforce.System.String NewUrl;
	public com.nawforce.runforce.System.String PluralLabel;
	public com.nawforce.runforce.System.String PublisherId;
	public com.nawforce.runforce.System.String QualifiedApiName;
	public Object RecordTypesSupported;
	public com.nawforce.runforce.System.String RunningUserEntityAccessId;

	public RelationshipInfo[] ChildRelationships;
	public FieldDefinition[] Fields;
	public OwnerChangeOptionInfo[] OwnerChangeOptions;
	public EntityParticle[] Particles;
	public RelationshipDomain[] RelationshipDomains;
	public SearchLayout[] SearchLayouts;

	public EntityDefinition clone$() {throw new java.lang.UnsupportedOperationException();}
	public EntityDefinition clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EntityDefinition clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EntityDefinition clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EntityDefinition clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
