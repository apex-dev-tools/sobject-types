/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class PersonalizationPoint extends SObject {
	public static SObjectType$<PersonalizationPoint> SObjectType;
	public static SObjectFields$<PersonalizationPoint> Fields;

	public Id AbnExperimentId;
	public AbnExperiment AbnExperiment;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DataSpaceId;
	public DataSpace DataSpace;
	public String Description;
	public String DeveloperName;
	public Id Id;
	public Boolean IsAuthenticationRequired;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Integer MaxItemsCount;
	public String Name;
	public String PersonalizationSchemaEnum;
	public Id PersonalizationSchemaId;
	public PersonalizationSchema PersonalizationSchema;
	public Id ProfileDataGraphId;
	public DataGraph ProfileDataGraph;
	public String RootPersonalizationPoint;
	public String Source;
	public Id SourceRecordId;
	public Name SourceRecord;
	public String Status;
	public Datetime SystemModstamp;

	public PersonalizationDecision[] Decisions;
	public PersnlExperience[] PersonalizationExperiences;
	public PersnlBatchDcsnPersnlPoint[] PersonalizationPoints;

	public PersonalizationPoint clone$() {throw new java.lang.UnsupportedOperationException();}
	public PersonalizationPoint clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PersonalizationPoint clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PersonalizationPoint clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PersonalizationPoint clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
