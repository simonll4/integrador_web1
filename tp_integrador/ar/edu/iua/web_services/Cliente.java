package ar.edu.iua.web_services;

public class Cliente {

	public void ejemploCrearPlan() {

		String url = "http://localhost:8080/crearPlan";

		String plan2040 = """
			[{
				"anio": 2040,
				"estado": "ACTIVO",
				"anios": [{
						"numero": 1,
						"nombre": "Primer anio",
						"materias": [{
								"codigo": 2040101,
								"nombre": "Lengua y Literatura I",
								"cargaHoraria": 5.0
							},
							{
								"codigo": 2040102,
								"nombre": "Lengua y Culturas Latinas I",
								"cargaHoraria": 4.0
							},
							{
								"codigo": 2040103,
								"nombre": "Ingles I",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2040104,
								"nombre": "Geografia I",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2040105,
								"nombre": "Historia I",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2040106,
								"nombre": "Matematica I",
								"cargaHoraria": 4.0
							},
							{
								"codigo": 2040107,
								"nombre": "Plastica I",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2040108,
								"nombre": "Musica I",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2040109,
								"nombre": "Ciencias Naturales I",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2040110,
								"nombre": "Formacion Etica y Ciudadana I",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2040111,
								"nombre": "Informatica I",
								"cargaHoraria": 4.0
							},
							{
								"codigo": 2040112,
								"nombre": "Educacion Fisica I",
								"cargaHoraria": 1.0
							}
						]
					},
					{
						"numero": 2,
						"nombre": "Segundo anio",
						"materias": [{
								"codigo": 2040201,
								"nombre": "Lengua y Literatura II",
								"cargaHoraria": 5.0
							},
							{
								"codigo": 2040202,
								"nombre": "Lengua y Cultura Latinas II",
								"cargaHoraria": 4.0
							},
							{
								"codigo": 2040203,
								"nombre": "Ingles II",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2040204,
								"nombre": "Formacion Etica y Ciudadana II",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2040205,
								"nombre": "Geografia II",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2040206,
								"nombre": "Historia II",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2040207,
								"nombre": "Matematica II",
								"cargaHoraria": 4.0
							},
							{
								"codigo": 2040208,
								"nombre": "Plastica II",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2040209,
								"nombre": "Musica II",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2040210,
								"nombre": "Ciencias Naturales II",
								"cargaHoraria": 4.0
							},
							{
								"codigo": 2040211,
								"nombre": "Materia Optativa",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2040212,
								"nombre": "Educacion Fisica II",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2040213,
								"nombre": "Materia Optativa",
								"cargaHoraria": 3.0
							}
						]
					},
					{
						"numero": 3,
						"nombre": "Tercero anio",
						"materias": [{
								"codigo": 2040301,
								"nombre": "Lengua y Literatura III",
								"cargaHoraria": 5.0
							},
							{
								"codigo": 2040302,
								"nombre": "Lengua y Cultura Latinas III",
								"cargaHoraria": 4.0
							},
							{
								"codigo": 2040303,
								"nombre": "Ingles III",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2040304,
								"nombre": "Formacion Etica y Ciudadana III",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2040305,
								"nombre": "Geografia III",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2040306,
								"nombre": "Historia III",
								"cargaHoraria": 4.0
							},
							{
								"codigo": 2040307,
								"nombre": "Materia Optativa",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2040308,
								"nombre": "Plastica III",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2040309,
								"nombre": "Materia Optativa",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2040310,
								"nombre": "Ciencias Naturales III",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2040311,
								"nombre": "Matematica III",
								"cargaHoraria": 4.0
							},
							{
								"codigo": 2040312,
								"nombre": "Educacion Fisica III",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2040313,
								"nombre": "Educacion Tecnologica",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2040314,
								"nombre": "Materia Optativa",
								"cargaHoraria": 3.0
							}
						]
					},
					{
						"numero": 4,
						"nombre": "Cuarto anio",
						"materias": [{
								"codigo": 2040401,
								"nombre": "Lengua y Literatura IV",
								"cargaHoraria": 4.0
							},
							{
								"codigo": 2040402,
								"nombre": "Lengua y Cultura Latinas IV",
								"cargaHoraria": 4.0
							},
							{
								"codigo": 2040403,
								"nombre": "Ingles IV",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2040404,
								"nombre": "Geografia IV",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2040405,
								"nombre": "Historia IV",
								"cargaHoraria": 4.0
							},
							{
								"codigo": 2040406,
								"nombre": "Lengua y Cultura Francesas I",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2040407,
								"nombre": "Historia del Arte",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2040408,
								"nombre": "Materia Optativa",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2040409,
								"nombre": "Matematica IV",
								"cargaHoraria": 5.0
							},
							{
								"codigo": 2040410,
								"nombre": "Biologia I",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2040411,
								"nombre": "Fisicoquimica",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2040412,
								"nombre": "Educacion Fisica IV",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2040413,
								"nombre": "Materia Optativa",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2040414,
								"nombre": "Materia Optativa",
								"cargaHoraria": 3.0
							}
						]
					},
					{
						"numero": 5,
						"nombre": "Quinto anio",
						"materias": [{
								"codigo": 2040501,
								"nombre": "Lengua y Literatura V",
								"cargaHoraria": 4.0
							},
							{
								"codigo": 2040502,
								"nombre": "Materia Optativa",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2040503,
								"nombre": "Lengua y Cultura Griegas I",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2040504,
								"nombre": "Ingles V",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2040505,
								"nombre": "Lengua y Cultura Francesas II",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2040506,
								"nombre": "Geografia V",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2040507,
								"nombre": "Historia V",
								"cargaHoraria": 4.0
							},
							{
								"codigo": 2040508,
								"nombre": "Quimica I",
								"cargaHoraria": 4.0
							},
							{
								"codigo": 2040509,
								"nombre": "Biologia II",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2040510,
								"nombre": "Matematica V  Algebra",
								"cargaHoraria": 5.0
							},
							{
								"codigo": 2040511,
								"nombre": "Logica",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2040512,
								"nombre": "Educacion Fisica V",
								"cargaHoraria": 3.0
							}
						]
					}
				]
			},
			{
				"anio": 2020,
				"estado": "BORRADOR",
				"anios": [{
						"numero": 1,
						"nombre": "Primer anio",
						"materias": [{
								"codigo": 2020101,
								"nombre": "Lengua y Literatura I",
								"cargaHoraria": 5.0
							},
							{
								"codigo": 2020102,
								"nombre": "Lengua y Culturas Latinas I",
								"cargaHoraria": 5.0
							},
							{
								"codigo": 2020103,
								"nombre": "Ingles I",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2020104,
								"nombre": "Geografia I",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2020105,
								"nombre": "Historia I",
								"cargaHoraria": 2.0
							},
							{
								"codigo": 2020106,
								"nombre": "Matematica I",
								"cargaHoraria": 4.0
							},
							{
								"codigo": 2020107,
								"nombre": "Plastica I",
								"cargaHoraria": 2.0
							},
							{
								"codigo": 2020108,
								"nombre": "Musica I",
								"cargaHoraria": 2.0
							},
							{
								"codigo": 2020109,
								"nombre": "Ciencias Naturales I",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2020110,
								"nombre": "Formacion Etica y Ciudadana I",
								"cargaHoraria": 2.0
							},
							{
								"codigo": 2020111,
								"nombre": "Informatica I",
								"cargaHoraria": 2.0
							},
							{
								"codigo": 2020112,
								"nombre": "Educacion Fisica I",
								"cargaHoraria": 2.0
							}
						]
					},
					{
						"numero": 2,
						"nombre": "Segundo anio",
						"materias": [{
								"codigo": 2020201,
								"nombre": "Lengua y Literatura II",
								"cargaHoraria": 5.0
							},
							{
								"codigo": 2020202,
								"nombre": "Lengua y Cultura Latinas II",
								"cargaHoraria": 5.0
							},
							{
								"codigo": 2020203,
								"nombre": "Ingles II",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2020204,
								"nombre": "Formacion Etica y Ciudadana II",
								"cargaHoraria": 2.0
							},
							{
								"codigo": 2020205,
								"nombre": "Geografia II",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2020206,
								"nombre": "Historia II",
								"cargaHoraria": 4.0
							},
							{
								"codigo": 2020207,
								"nombre": "Matematica II",
								"cargaHoraria": 4.0
							},
							{
								"codigo": 2020208,
								"nombre": "Plastica II",
								"cargaHoraria": 2.0
							},
							{
								"codigo": 2020209,
								"nombre": "Musica II",
								"cargaHoraria": 2.0
							},
							{
								"codigo": 2020210,
								"nombre": "Ciencias Naturales II",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2020211,
								"nombre": "Materia Optativa",
								"cargaHoraria": 2.0
							},
							{
								"codigo": 2020212,
								"nombre": "Educacion Fisica II",
								"cargaHoraria": 2.0
							}
						]
					},
					{
						"numero": 3,
						"nombre": "Tercero anio",
						"materias": [{
								"codigo": 2020301,
								"nombre": "Lengua y Literatura III",
								"cargaHoraria": 5.0
							},
							{
								"codigo": 2020302,
								"nombre": "Lengua y Cultura Latinas III",
								"cargaHoraria": 4.0
							},
							{
								"codigo": 2020303,
								"nombre": "Ingles III",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2020304,
								"nombre": "Formacion Etica y Ciudadana III",
								"cargaHoraria": 2.0
							},
							{
								"codigo": 2020305,
								"nombre": "Geografia III",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2020306,
								"nombre": "Historia III",
								"cargaHoraria": 4.0
							},
							{
								"codigo": 2020307,
								"nombre": "Materia Optativa",
								"cargaHoraria": 2.0
							},
							{
								"codigo": 2020308,
								"nombre": "Plastica III",
								"cargaHoraria": 2.0
							},
							{
								"codigo": 2020309,
								"nombre": "Musica III",
								"cargaHoraria": 2.0
							},
							{
								"codigo": 2020310,
								"nombre": "Ciencias Naturales III",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2020311,
								"nombre": "Matematica III",
								"cargaHoraria": 5.0
							},
							{
								"codigo": 2020312,
								"nombre": "Educacion Fisica III",
								"cargaHoraria": 2.0
							}
						]
					},
					{
						"numero": 4,
						"nombre": "Cuarto anio",
						"materias": [{
								"codigo": 2020401,
								"nombre": "Lengua y Literatura IV",
								"cargaHoraria": 4.0
							},
							{
								"codigo": 2020402,
								"nombre": "Lengua y Cultura Latinas IV",
								"cargaHoraria": 5.0
							},
							{
								"codigo": 2020403,
								"nombre": "Ingles IV",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2020404,
								"nombre": "Geografia IV",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2020405,
								"nombre": "Historia IV",
								"cargaHoraria": 4.0
							},
							{
								"codigo": 2020406,
								"nombre": "Formacion Etica y Civica IV",
								"cargaHoraria": 2.0
							},
							{
								"codigo": 2020407,
								"nombre": "Historia Del Arte II",
								"cargaHoraria": 2.0
							},
							{
								"codigo": 2020408,
								"nombre": "Plastica IV",
								"cargaHoraria": 2.0
							},
							{
								"codigo": 2020409,
								"nombre": "Matematica IV",
								"cargaHoraria": 5.0
							},
							{
								"codigo": 2020410,
								"nombre": "Biologia I",
								"cargaHoraria": 2.0
							},
							{
								"codigo": 2020411,
								"nombre": "Fisicoquimica",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2020412,
								"nombre": "Educacion Fisica IV",
								"cargaHoraria": 2.0
							}
						]
					},
					{
						"numero": 5,
						"nombre": "Quinto anio",
						"materias": [{
								"codigo": 2020501,
								"nombre": "Lengua y Literatura V",
								"cargaHoraria": 4.0
							},
							{
								"codigo": 2020502,
								"nombre": "Lengua y Cultura Latinas V",
								"cargaHoraria": 2.0
							},
							{
								"codigo": 2020503,
								"nombre": "Lengua y Cultura Griegas I",
								"cargaHoraria": 4.0
							},
							{
								"codigo": 2020504,
								"nombre": "Ingles V",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2020505,
								"nombre": "Frances I",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2020506,
								"nombre": "Geografia V",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2020507,
								"nombre": "Historia V",
								"cargaHoraria": 4.0
							},
							{
								"codigo": 2020508,
								"nombre": "Quimica I",
								"cargaHoraria": 2.0
							},
							{
								"codigo": 2020509,
								"nombre": "Biologia II",
								"cargaHoraria": 2.0
							},
							{
								"codigo": 2020510,
								"nombre": "Matematica V  Algebra",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2020511,
								"nombre": "Estadistica y Probabilidades",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2020512,
								"nombre": "Educacion Fisica V",
								"cargaHoraria": 2.0
							},
							{
								"codigo": 2020513,
								"nombre": "Informatica II",
								"cargaHoraria": 2.0
							},
							{
								"codigo": 2020514,
								"nombre": "Metodologia De La Investigacion",
								"cargaHoraria": 2.0
							},
							{
								"codigo": 2020515,
								"nombre": "Filosofia I",
								"cargaHoraria": 2.0
							}
						]
					},
					{
						"numero": 6,
						"nombre": "Sexto anio",
						"materias": [{
								"codigo": 2020601,
								"nombre": "Lengua y Literatura VI",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2020602,
								"nombre": "Lengua y Cultura Griegas II",
								"cargaHoraria": 2.0
							},
							{
								"codigo": 2020603,
								"nombre": "Ingles VI",
								"cargaHoraria": 2.0
							},
							{
								"codigo": 2020604,
								"nombre": "Frances II",
								"cargaHoraria": 4.0
							},
							{
								"codigo": 2020605,
								"nombre": "Historia VI",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2020606,
								"nombre": "Historia De La Cultura I",
								"cargaHoraria": 2.0
							},
							{
								"codigo": 2020607,
								"nombre": "Geografia VI",
								"cargaHoraria": 2.0
							},
							{
								"codigo": 2020608,
								"nombre": "Folosofia II",
								"cargaHoraria": 4.0
							},
							{
								"codigo": 2020609,
								"nombre": "Matematica VI  Trigonometria",
								"cargaHoraria": 2.0
							},
							{
								"codigo": 2020610,
								"nombre": "Geometria",
								"cargaHoraria": 2.0
							},
							{
								"codigo": 2020611,
								"nombre": "Biologia III",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2020612,
								"nombre": "Quimica II",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2020613,
								"nombre": "Fisica I",
								"cargaHoraria": 4.0
							},
							{
								"codigo": 2020614,
								"nombre": "Informatica III",
								"cargaHoraria": 2.0
							},
							{
								"codigo": 2020615,
								"nombre": "Educacion Fisica VI",
								"cargaHoraria": 2.0
							}
						]
					},
					{
						"numero": 7,
						"nombre": "Septimo anio",
						"materias": [{
								"codigo": 2020701,
								"nombre": "Lengua y Literatura VII",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2020702,
								"nombre": "Lengua y Cultura Griegas III",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2020703,
								"nombre": "Frances III",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2020704,
								"nombre": "Historia VII",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2020705,
								"nombre": "Filosofia III",
								"cargaHoraria": 4.0
							},
							{
								"codigo": 2020706,
								"nombre": "Psicologia",
								"cargaHoraria": 2.0
							},
							{
								"codigo": 2020707,
								"nombre": "Analisis Matematico y Geometria Analitica",
								"cargaHoraria": 4.0
							},
							{
								"codigo": 2020708,
								"nombre": "Biologia IV",
								"cargaHoraria": 2.0
							},
							{
								"codigo": 2020709,
								"nombre": "Sociologia",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2020710,
								"nombre": "Economia Politica",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2020711,
								"nombre": "Historia De La Cultura II",
								"cargaHoraria": 2.0
							},
							{
								"codigo": 2020712,
								"nombre": "Elementos De Derecho Y Derecho Constitucional Argentino",
								"cargaHoraria": 3.0
							},
							{
								"codigo": 2020713,
								"nombre": "Informatica IV",
								"cargaHoraria": 2.0
							},
							{
								"codigo": 2020714,
								"nombre": "Educacion Fisica VII",
								"cargaHoraria": 2.0
							},
							{
								"codigo": 2020715,
								"nombre": "Fisica II",
								"cargaHoraria": 3.0
							}
						]
					}
				]
			}
		]



						                """;

	}

	public void ejemploModificarPlan() {

		String url = "http://localhost:8080/crearPlan";

		String plan2020 = """
				{
					"anio": 2040,
					"estado": "NO_ACTIVO",
					"anios": [{
							"numero": 1,
							"nombre": "Primer anio",
							"materias": [{
									"codigo": 2040101,
									"nombre": "Lengua y Literatura I",
									"cargaHoraria": 5.0
								},
								{
									"codigo": 2040102,
									"nombre": "Lengua y Culturas Latinas I",
									"cargaHoraria": 5.0
								},
								{
									"codigo": 2040103,
									"nombre": "Ingles I",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040104,
									"nombre": "Geografia I",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040105,
									"nombre": "Historia I",
									"cargaHoraria": 2.0
								},
								{
									"codigo": 2040106,
									"nombre": "Matematica I",
									"cargaHoraria": 4.0
								},
								{
									"codigo": 2040107,
									"nombre": "Plastica I",
									"cargaHoraria": 2.0
								},
								{
									"codigo": 2040108,
									"nombre": "Musica I",
									"cargaHoraria": 2.0
								},
								{
									"codigo": 2040109,
									"nombre": "Ciencias Naturales I",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040110,
									"nombre": "Tecnicas de Trabajo Intelectual I",
									"cargaHoraria": 2.0
								},
								{
									"codigo": 2040111,
									"nombre": "Informatica I",
									"cargaHoraria": 2.0
								},
								{
									"codigo": 2040112,
									"nombre": "Educacion Fisica I",
									"cargaHoraria": 2.0
								}
							]
						},
						{
							"numero": 2,
							"nombre": "Segundo anio",
							"materias": [{
									"codigo": 2040201,
									"nombre": "Lengua y Literatura Castellanas II",
									"cargaHoraria": 5.0
								},
								{
									"codigo": 2040202,
									"nombre": "Lengua y Cultura Latinas II",
									"cargaHoraria": 4.0
								},
								{
									"codigo": 2040203,
									"nombre": "Lengua y Cultura Inglesas II",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040204,
									"nombre": "Formacion Etica y Ciudadana II",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040205,
									"nombre": "Geografia II",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040206,
									"nombre": "Historia II",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040207,
									"nombre": "Matematica II",
									"cargaHoraria": 4.0
								},
								{
									"codigo": 2040208,
									"nombre": "Formacion Plastica II",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040209,
									"nombre": "Formacion Musical II",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040210,
									"nombre": "Educacion para la Salud",
									"cargaHoraria": 4.0
								},
								{
									"codigo": 2040211,
									"nombre": "Materia Optativa",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040212,
									"nombre": "Educacion Fisica y Deportes II",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040213,
									"nombre": "Materia Optativa",
									"cargaHoraria": 3.0
								}
							]
						},
						{
							"numero": 3,
							"nombre": "Tercero anio",
							"materias": [{
									"codigo": 2040301,
									"nombre": "Lengua y Literatura III",
									"cargaHoraria": 5.0
								},
								{
									"codigo": 2040302,
									"nombre": "Lengua y Cultura Latinas III",
									"cargaHoraria": 4.0
								},
								{
									"codigo": 2040303,
									"nombre": "Ingles III",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040304,
									"nombre": "Formacion Etica y Civica II",
									"cargaHoraria": 2.0
								},
								{
									"codigo": 2040305,
									"nombre": "Geografia III",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040306,
									"nombre": "Historia III",
									"cargaHoraria": 4.0
								},
								{
									"codigo": 2040307,
									"nombre": "Historia Del Arte I",
									"cargaHoraria": 2.0
								},
								{
									"codigo": 2040308,
									"nombre": "Plastica III",
									"cargaHoraria": 2.0
								},
								{
									"codigo": 2040309,
									"nombre": "Musica III",
									"cargaHoraria": 2.0
								},
								{
									"codigo": 2040310,
									"nombre": "Ciencias Naturales III",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040311,
									"nombre": "Matematica III",
									"cargaHoraria": 5.0
								},
								{
									"codigo": 2040312,
									"nombre": "Educacion Fisica III",
									"cargaHoraria": 2.0
								}
							]
						},
						{
							"numero": 4,
							"nombre": "Cuarto anio",
							"materias": [{
									"codigo": 2040401,
									"nombre": "Lengua y Literatura Castellanas IV",
									"cargaHoraria": 4.0
								},
								{
									"codigo": 2040402,
									"nombre": "Lengua y Cultura Latinas IV",
									"cargaHoraria": 4.0
								},
								{
									"codigo": 2040403,
									"nombre": "Lengua y Cultura Inglesas IV",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040404,
									"nombre": "Geografia IV",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040405,
									"nombre": "Historia IV",
									"cargaHoraria": 4.0
								},
								{
									"codigo": 2040406,
									"nombre": "Lengua y Cultura Francesas I",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040407,
									"nombre": "Historia del Arte",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040408,
									"nombre": "Materia Optativa",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040409,
									"nombre": "Matematica IV",
									"cargaHoraria": 5.0
								},
								{
									"codigo": 2040410,
									"nombre": "Biologia I",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040411,
									"nombre": "FisicoQuimica",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040412,
									"nombre": "Educacion Fisica y Escuadras I",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040413,
									"nombre": "Materia Optativa",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040414,
									"nombre": "Materia Optativa",
									"cargaHoraria": 3.0
								}
							]
						},
						{
							"numero": 5,
							"nombre": "Quinto anio",
							"materias": [{
									"codigo": 2040501,
									"nombre": "Lengua y Literatura V",
									"cargaHoraria": 4.0
								},
								{
									"codigo": 2040502,
									"nombre": "Lengua y Cultura Latinas V",
									"cargaHoraria": 2.0
								},
								{
									"codigo": 2040503,
									"nombre": "Lengua y Cultura Griegas I",
									"cargaHoraria": 4.0
								},
								{
									"codigo": 2040504,
									"nombre": "Ingles V",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040505,
									"nombre": "Frances I",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040506,
									"nombre": "Geografia V",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040507,
									"nombre": "Historia V",
									"cargaHoraria": 4.0
								},
								{
									"codigo": 2040508,
									"nombre": "Quimica I",
									"cargaHoraria": 2.0
								},
								{
									"codigo": 2040509,
									"nombre": "Biologia II",
									"cargaHoraria": 2.0
								},
								{
									"codigo": 2040510,
									"nombre": "Matematica V  Algebra",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040511,
									"nombre": "Estadistica y Probabilidades",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040512,
									"nombre": "Educacion Fisica V",
									"cargaHoraria": 2.0
								},
								{
									"codigo": 2040513,
									"nombre": "Informatica II",
									"cargaHoraria": 2.0
								},
								{
									"codigo": 2040514,
									"nombre": "Metodologia De La Investigacion",
									"cargaHoraria": 2.0
								},
								{
									"codigo": 2040515,
									"nombre": "Filosofia I",
									"cargaHoraria": 2.0
								}
							]
						}
					]
				}


				                """;
	}
}