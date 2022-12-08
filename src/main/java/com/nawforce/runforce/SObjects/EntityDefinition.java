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
public class EntityDefinition extends SObject {
	public static SObjectType$<EntityDefinition> SObjectType;
	public static SObjectFields$<EntityDefinition> Fields;

	public String DefaultCompactLayoutId;
	public String DefaultImplementation;
	public String DeploymentStatus;
	public String DetailUrl;
	public String DeveloperName;
	public String DurableId;
	public String EditDefinitionUrl;
	public String EditUrl;
	public String ExtendedBy;
	public String ExtendsInterfaces;
	public String ExternalSharingModel;
	public Boolean HasSubtypes;
	public String HelpSettingPageName;
	public String HelpSettingPageUrl;
	public Id Id;
	public String ImplementedBy;
	public String ImplementsInterfaces;
	public String InternalSharingModel;
	public Boolean IsApexTriggerable;
	public Boolean IsAutoActivityCaptureEnabled;
	public Boolean IsCompactLayoutable;
	public Boolean IsCustomSetting;
	public Boolean IsCustomizable;
	public Boolean IsDeprecatedAndHidden;
	public Boolean IsEverCreatable;
	public Boolean IsEverDeletable;
	public Boolean IsEverUpdatable;
	public Boolean IsFeedEnabled;
	public Boolean IsIdEnabled;
	public Boolean IsInterface;
	public Boolean IsLayoutable;
	public Boolean IsMruEnabled;
	public Boolean IsProcessEnabled;
	public Boolean IsQueryable;
	public Boolean IsReplicateable;
	public Boolean IsRetrieveable;
	public Boolean IsSearchLayoutable;
	public Boolean IsSearchable;
	public Boolean IsSubtype;
	public Boolean IsTriggerable;
	public Boolean IsWorkflowEnabled;
	public String KeyPrefix;
	public String Label;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public String NewUrl;
	public String PluralLabel;
	public String PublisherId;
	public String QualifiedApiName;
	public Object RecordTypesSupported;
	public String RunningUserEntityAccessId;

	public RelationshipInfo[] ChildRelationships;
	public FieldDefinition[] Fields;
	public FlowDefinitionView[] FlowDefinitionViews;
	public OwnerChangeOptionInfo[] OwnerChangeOptions;
	public EntityParticle[] Particles;
	public RelatedListDefinition[] RelatedListDefinitions;
	public RelationshipDomain[] RelationshipDomains;
	public SearchLayout[] SearchLayouts;

	public EntityDefinition clone$() {throw new java.lang.UnsupportedOperationException();}
	public EntityDefinition clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EntityDefinition clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EntityDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EntityDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
